/// obet datos desde Assets, desde issue

def nombreDePagina = "Nombre de página"
def tableContent = ""
def KEYObject = "ABC-124"


def body = """
<h2>${nombreDePagina}</h2>
<p />
   <ac:adf-extension>
      <ac:adf-node type=\"block-card\">
         <ac:adf-attribute key=\"datasource\">
            <ac:adf-parameter key=\"id\">361d618a-3c04-40ad-9b27-3c8ea6927020</ac:adf-parameter>
            <ac:adf-parameter key=\"parameters\">
               <ac:adf-parameter key=\"workspace-id\">fbf0fea3-d586-4869-b3a9-19d0df62743f</ac:adf-parameter>
               <ac:adf-parameter key=\"aql\">objectType = Servicio and &quot;Squad-Unidad&quot; IN (&quot;CDSI-348769&quot;) AND &quot;Estado&quot; NOT IN (&quot;Retired&quot;) and &quot;Tipo de activo de informaci&oacute;n&quot; = APL</ac:adf-parameter>
               <ac:adf-parameter key=\"schema-id\">6</ac:adf-parameter>
               <ac:adf-parameter key=\"version\">2</ac:adf-parameter>
            </ac:adf-parameter>
            <ac:adf-parameter key=\"views\">
               <ac:adf-parameter-value>
                  <ac:adf-parameter key=\"type\">table</ac:adf-parameter>
                  <ac:adf-parameter key=\"properties\">
                     <ac:adf-parameter key=\"columns\">
                        <ac:adf-parameter-value>
                           <ac:adf-parameter key=\"key\">name:0:0</ac:adf-parameter>
                        </ac:adf-parameter-value>
                        <ac:adf-parameter-value>
                           <ac:adf-parameter key=\"key\">descripcion larga:0:9</ac:adf-parameter>
                        </ac:adf-parameter-value>
                        <ac:adf-parameter-value>
                           <ac:adf-parameter key=\"key\">categoria del servicio:1</ac:adf-parameter>
                        </ac:adf-parameter-value>
                        <ac:adf-parameter-value>
                           <ac:adf-parameter key=\"key\">subcategoria del servicio:1</ac:adf-parameter>
                        </ac:adf-parameter-value>
                        <ac:adf-parameter-value>
                           <ac:adf-parameter key=\"key\">grupo soporte:1</ac:adf-parameter>
                        </ac:adf-parameter-value>
                        <ac:adf-parameter-value>
                           <ac:adf-parameter key=\"key\">tribu_coe:1</ac:adf-parameter>
                        </ac:adf-parameter-value>
                     </ac:adf-parameter>
                  </ac:adf-parameter>
               </ac:adf-parameter-value>
            </ac:adf-parameter>
         </ac:adf-attribute>
         <ac:adf-attribute key=\"layout\">full-width</ac:adf-attribute>
      </ac:adf-node>
      <ac:adf-fallback>
         <ac:adf-node type=\"block-card\">
            <ac:adf-attribute key=\"datasource\">
               <ac:adf-parameter key=\"id\">361d618a-3c04-40ad-9b27-3c8ea6927020</ac:adf-parameter>
               <ac:adf-parameter key=\"parameters\">
                  <ac:adf-parameter key=\"workspace-id\">fbf0fea3-d586-4869-b3a9-19d0df62743f</ac:adf-parameter>
                  <ac:adf-parameter key=\"aql\">objectType = Servicio and &quot;Squad-Unidad&quot; IN (&quot;CDSI-348769&quot;) AND &quot;Estado&quot; NOT IN (&quot;Retired&quot;) and &quot;Tipo de activo de informaci&oacute;n&quot; = APL</ac:adf-parameter>
                  <ac:adf-parameter key=\"schema-id\">6</ac:adf-parameter>
                  <ac:adf-parameter key=\"version\">2</ac:adf-parameter>
               </ac:adf-parameter>
               <ac:adf-parameter key=\"views\">
                  <ac:adf-parameter-value>
                     <ac:adf-parameter key=\"type\">table</ac:adf-parameter>
                     <ac:adf-parameter key=\"properties\">
                        <ac:adf-parameter key=\"columns\">
                           <ac:adf-parameter-value>
                              <ac:adf-parameter key=\"key\">name:0:0</ac:adf-parameter>
                           </ac:adf-parameter-value>
                           <ac:adf-parameter-value>
                              <ac:adf-parameter key=\"key\">descripcion larga:0:9</ac:adf-parameter>
                           </ac:adf-parameter-value>
                           <ac:adf-parameter-value>
                              <ac:adf-parameter key=\"key\">categoria del servicio:1</ac:adf-parameter>
                           </ac:adf-parameter-value>
                           <ac:adf-parameter-value>
                              <ac:adf-parameter key=\"key\">subcategoria del servicio:1</ac:adf-parameter>
                           </ac:adf-parameter-value>
                           <ac:adf-parameter-value>
                              <ac:adf-parameter key=\"key\">grupo soporte:1</ac:adf-parameter>
                           </ac:adf-parameter-value>
                           <ac:adf-parameter-value>
                              <ac:adf-parameter key=\"key\">tribu_coe:1</ac:adf-parameter>
                           </ac:adf-parameter-value>
                        </ac:adf-parameter>
                     </ac:adf-parameter>
                  </ac:adf-parameter-value>
               </ac:adf-parameter>
            </ac:adf-attribute>
            <ac:adf-attribute key=\"layout\">full-width</ac:adf-attribute>
         </ac:adf-node>
      </ac:adf-fallback>
   </ac:adf-extension>
<h2>Tecnologias</h2>
<p />
   <ac:adf-extension>
      <ac:adf-node type=\"block-card\">
         <ac:adf-attribute key=\"datasource\">
            <ac:adf-parameter key=\"id\">361d618a-3c04-40ad-9b27-3c8ea6927020</ac:adf-parameter>
            <ac:adf-parameter key=\"parameters\">
               <ac:adf-parameter key=\"workspace-id\">fbf0fea3-d586-4869-b3a9-19d0df62743f</ac:adf-parameter>
               <ac:adf-parameter key=\"aql\">objectType = Servicio and &quot;Squad-Unidad&quot; IN (&quot;CDSI-348769&quot;) AND &quot;Estado&quot; NOT IN (&quot;Retired&quot;) and &quot;Tipo de activo de informaci&oacute;n&quot; = TEC</ac:adf-parameter>
               <ac:adf-parameter key=\"schema-id\">6</ac:adf-parameter>
               <ac:adf-parameter key=\"version\">2</ac:adf-parameter>
            </ac:adf-parameter>
            <ac:adf-parameter key=\"views\">
               <ac:adf-parameter-value>
                  <ac:adf-parameter key=\"type\">table</ac:adf-parameter>
                  <ac:adf-parameter key=\"properties\">
                     <ac:adf-parameter key=\"columns\">
                        <ac:adf-parameter-value>
                           <ac:adf-parameter key=\"key\">name:0:0</ac:adf-parameter>
                           <ac:adf-parameter key=\"width\" type=\"integer\">294</ac:adf-parameter>
                        </ac:adf-parameter-value>
                        <ac:adf-parameter-value>
                           <ac:adf-parameter key=\"key\">descripcion larga:0:9</ac:adf-parameter>
                        </ac:adf-parameter-value>
                        <ac:adf-parameter-value>
                           <ac:adf-parameter key=\"key\">c&oacute;digo de aplicaci&oacute;n:1</ac:adf-parameter>
                        </ac:adf-parameter-value>
                        <ac:adf-parameter-value>
                           <ac:adf-parameter key=\"key\">categoria del servicio:1</ac:adf-parameter>
                        </ac:adf-parameter-value>
                        <ac:adf-parameter-value>
                           <ac:adf-parameter key=\"key\">subcategoria del servicio:1</ac:adf-parameter>
                        </ac:adf-parameter-value>
                        <ac:adf-parameter-value>
                           <ac:adf-parameter key=\"key\">grupo soporte:1</ac:adf-parameter>
                        </ac:adf-parameter-value>
                        <ac:adf-parameter-value>
                           <ac:adf-parameter key=\"key\">tribu_coe:1</ac:adf-parameter>
                        </ac:adf-parameter-value>
                     </ac:adf-parameter>
                  </ac:adf-parameter>
               </ac:adf-parameter-value>
            </ac:adf-parameter>
         </ac:adf-attribute>
         <ac:adf-attribute key=\"layout\">full-width</ac:adf-attribute>
      </ac:adf-node>
      <ac:adf-fallback>
         <ac:adf-node type=\"block-card\">
            <ac:adf-attribute key=\"datasource\">
               <ac:adf-parameter key=\"id\">361d618a-3c04-40ad-9b27-3c8ea6927020</ac:adf-parameter>
               <ac:adf-parameter key=\"parameters\">
                  <ac:adf-parameter key=\"workspace-id\">fbf0fea3-d586-4869-b3a9-19d0df62743f</ac:adf-parameter>
                  <ac:adf-parameter key=\"aql\">objectType = Servicio and &quot;Squad-Unidad&quot; IN (&quot;CDSI-348769&quot;) AND &quot;Estado&quot; NOT IN (&quot;Retired&quot;) and &quot;Tipo de activo de informaci&oacute;n&quot; = TEC</ac:adf-parameter>
                  <ac:adf-parameter key=\"schema-id\">6</ac:adf-parameter>
                  <ac:adf-parameter key=\"version\">2</ac:adf-parameter>
               </ac:adf-parameter>
               <ac:adf-parameter key=\"views\">
                  <ac:adf-parameter-value>
                     <ac:adf-parameter key=\"type\">table</ac:adf-parameter>
                     <ac:adf-parameter key=\"properties\">
                        <ac:adf-parameter key=\"columns\">
                           <ac:adf-parameter-value>
                              <ac:adf-parameter key=\"key\">name:0:0</ac:adf-parameter>
                              <ac:adf-parameter key=\"width\" type=\"integer\">294</ac:adf-parameter>
                           </ac:adf-parameter-value>
                           <ac:adf-parameter-value>
                              <ac:adf-parameter key=\"key\">descripcion larga:0:9</ac:adf-parameter>
                           </ac:adf-parameter-value>
                           <ac:adf-parameter-value>
                              <ac:adf-parameter key=\"key\">c&oacute;digo de aplicaci&oacute;n:1</ac:adf-parameter>
                           </ac:adf-parameter-value>
                           <ac:adf-parameter-value>
                              <ac:adf-parameter key=\"key\">categoria del servicio:1</ac:adf-parameter>
                           </ac:adf-parameter-value>
                           <ac:adf-parameter-value>
                              <ac:adf-parameter key=\"key\">subcategoria del servicio:1</ac:adf-parameter>
                           </ac:adf-parameter-value>
                           <ac:adf-parameter-value>
                              <ac:adf-parameter key=\"key\">grupo soporte:1</ac:adf-parameter>
                           </ac:adf-parameter-value>
                           <ac:adf-parameter-value>
                              <ac:adf-parameter key=\"key\">tribu_coe:1</ac:adf-parameter>
                           </ac:adf-parameter-value>
                        </ac:adf-parameter>
                     </ac:adf-parameter>
                  </ac:adf-parameter-value>
               </ac:adf-parameter>
            </ac:adf-attribute>
            <ac:adf-attribute key=\"layout\">full-width</ac:adf-attribute>
         </ac:adf-node>
      </ac:adf-fallback>
   </ac:adf-extension>
<h2>Grupos de Tareas</h2>
<p />
   <ac:adf-extension>
      <ac:adf-node type=\"block-card\">
         <ac:adf-attribute key=\"datasource\">
            <ac:adf-parameter key=\"id\">361d618a-3c04-40ad-9b27-3c8ea6927020</ac:adf-parameter>
            <ac:adf-parameter key=\"parameters\">
               <ac:adf-parameter key=\"workspace-id\">fbf0fea3-d586-4869-b3a9-19d0df62743f</ac:adf-parameter>
               <ac:adf-parameter key=\"aql\">object HAVING outboundReferences(objectType = Servicio AND &quot;Squad-Unidad&quot; IN (&quot;${KEYObject}&quot;) AND &quot;Estado&quot; NOT IN (&quot;Retired&quot;) AND &quot;Tipo de activo de informaci&oacute;n&quot; IN (&quot;APL&quot;,TEC))</ac:adf-parameter>
               <ac:adf-parameter key=\"schema-id\">6</ac:adf-parameter>
               <ac:adf-parameter key=\"version\">2</ac:adf-parameter>
            </ac:adf-parameter>
            <ac:adf-parameter key=\"views\">
               <ac:adf-parameter-value>
                  <ac:adf-parameter key=\"type\">table</ac:adf-parameter>
                  <ac:adf-parameter key=\"properties\">
                     <ac:adf-parameter key=\"columns\">
                        <ac:adf-parameter-value>
                           <ac:adf-parameter key=\"key\">name:0:0</ac:adf-parameter>
                        </ac:adf-parameter-value>
                     </ac:adf-parameter>
                  </ac:adf-parameter>
               </ac:adf-parameter-value>
            </ac:adf-parameter>
         </ac:adf-attribute>
         <ac:adf-attribute key=\"layout\">center</ac:adf-attribute>
      </ac:adf-node>
      <ac:adf-fallback>
         <ac:adf-node type=\"block-card\">
            <ac:adf-attribute key=\"datasource\">
               <ac:adf-parameter key=\"id\">361d618a-3c04-40ad-9b27-3c8ea6927020</ac:adf-parameter>
               <ac:adf-parameter key=\"parameters\">
                  <ac:adf-parameter key=\"workspace-id\">fbf0fea3-d586-4869-b3a9-19d0df62743f</ac:adf-parameter>
                  <ac:adf-parameter key=\"aql\">object HAVING outboundReferences(objectType = Servicio AND &quot;Squad-Unidad&quot; IN (&quot;CDSI-348769&quot;) AND &quot;Estado&quot; NOT IN (&quot;Retired&quot;) AND &quot;Tipo de activo de informaci&oacute;n&quot; IN (&quot;APL&quot;,TEC))</ac:adf-parameter>
                  <ac:adf-parameter key=\"schema-id\">6</ac:adf-parameter>
                  <ac:adf-parameter key=\"version\">2</ac:adf-parameter>
               </ac:adf-parameter>
               <ac:adf-parameter key=\"views\">
                  <ac:adf-parameter-value>
                     <ac:adf-parameter key=\"type\">table</ac:adf-parameter>
                     <ac:adf-parameter key=\"properties\">
                        <ac:adf-parameter key=\"columns\">
                           <ac:adf-parameter-value>
                              <ac:adf-parameter key=\"key\">name:0:0</ac:adf-parameter>
                           </ac:adf-parameter-value>
                        </ac:adf-parameter>
                     </ac:adf-parameter>
                  </ac:adf-parameter-value>
               </ac:adf-parameter>
            </ac:adf-attribute>
            <ac:adf-attribute key=\"layout\">center</ac:adf-attribute>
         </ac:adf-node>
      </ac:adf-fallback>
      <table>
        ${tableContent}
      </table>
   </ac:adf-extension>
<p />
<p />
"""

//llamar la api de actualizacion de la pagina
