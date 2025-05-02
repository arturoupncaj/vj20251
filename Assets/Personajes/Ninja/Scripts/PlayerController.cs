using UnityEngine;

public class PlayerController : MonoBehaviour
{
    public GameObject kunaiPrefab;
    public int kunaisDisponibles = 5;


    Rigidbody2D rb;
    SpriteRenderer sr;
    Animator animator;

    private string direccion = "Derecha";
    private bool puedeMoverseVerticalMente = false;
    private float defaultGravityScale = 1f;
    private bool puedeSaltar = true;
    private bool puedeLanzarKunai = true;

    


    // Start is called once before the first execution of Update after the MonoBehaviour is created
    void Start()
    {
        Debug.Log("Iniciando PlayerController");

        rb = GetComponent<Rigidbody2D>();
        sr = GetComponent<SpriteRenderer>();
        animator = GetComponent<Animator>();

        defaultGravityScale = rb.gravityScale;
    }

    // Update is called once per frame
    void Update()
    {
        SetupMoverseHorizontal();
        SetupMoverseVertical();
        SetupSalto();
        SetUpLanzarKunai();
    }


    void OnCollisionEnter2D(Collision2D collision)
    {
        if (collision.gameObject.CompareTag("Enemigo"))
        {
            ZombieController zombie = collision.gameObject.GetComponent<ZombieController>();
            Debug.Log($"Colision con Enemigo: ${zombie.puntosVida}");
            Destroy(collision.gameObject);
        }
    }

    void OnTriggerStay2D(Collider2D other)
    {
        Debug.Log($"Trigger con: {other.gameObject.name}");
        if (other.gameObject.name == "Muro") {
            puedeMoverseVerticalMente = true;
        }
    }

    void OnTriggerExit2D(Collider2D other)
    {
        Debug.Log($"Trigger con: {other.gameObject.name}");
        if (other.gameObject.name == "Muro") {
            puedeMoverseVerticalMente = false;
            rb.gravityScale = defaultGravityScale;
        }
    }


    void SetupMoverseHorizontal() {
        rb.linearVelocityX = 0;
        animator.SetInteger("Estado", 0);

        if (Input.GetKey(KeyCode.RightArrow))
        {
            rb.linearVelocityX = 10;
            sr.flipX = false;
            direccion = "Derecha";
            animator.SetInteger("Estado", 1);
        }
        if (Input.GetKey(KeyCode.LeftArrow))
        {
            rb.linearVelocityX = -10;
            sr.flipX = true;
            direccion = "Izquierda";
            animator.SetInteger("Estado", 1);
        }
    }

    void SetupMoverseVertical() {
        
        if (!puedeMoverseVerticalMente) return;
        rb.gravityScale = 0;
        rb.linearVelocityY = 0;
        if (Input.GetKey(KeyCode.UpArrow))
        {
            rb.linearVelocityY = 10;
        }
        if (Input.GetKey(KeyCode.DownArrow))
        {
            rb.linearVelocityY = -10;
        }
    }

    void SetupSalto() {
        if (!puedeSaltar) return;
        if (Input.GetKeyUp(KeyCode.Space))
        {
            rb.linearVelocityY = 12.5f;
        }
    }

    void SetUpLanzarKunai() {
        if (!puedeLanzarKunai || kunaisDisponibles <= 0) return;
        if (Input.GetKeyUp(KeyCode.K))
        {
            GameObject kunai = Instantiate(kunaiPrefab, transform.position, Quaternion.Euler(0, 0, -90));
            kunai.GetComponent<KunaiController>().SetDirection(direccion);
            kunaisDisponibles -= 1;
        }
    }
}
