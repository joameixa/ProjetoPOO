package corridaveiculos;

public class percurso{
	// =======================================================
		// ===================== ATRIBUTOS =======================
		// =======================================================
			
			private String piso;	// Piso alcatrão, Piso Terra Batida, Piso Molhado
			private String comprimento; // Quantos metros ou Km de percurso
			private String estado; // estado: subida , descida 
			private String localidade;
			
							
		// =======================================================
		// ============ ACESSORES e MODIFICADORES ===============
		// =======================================================
			public String getPiso() {
				return piso;
			}
		
		//public void setPiso(String piso) {
				//this.piso = piso;
			//}
		
			public String getComprimento() {
				return comprimento;
			}
			public void setComprimento(String comprimento) {
				this.comprimento = comprimento;
			}
			public String getEstado() {
				return estado;
			}
			public void setEstado(String estado) {
				this.estado = estado;
			}
			public String getLocalidade() {
				return localidade;
			}
			public void setLocalidade(String localidade) {
				this.localidade = localidade;
			}
			
			
		// =======================================================
		// =================== CONSTRUTORES =====================
		// ======================================================= 
		    
			// CONSTRUTOR DEFAULT
			public percurso() 
			{
				
			}
		    // CONSTRUTOR COM PARÂMETROS

			public percurso(String piso, String comprimento, String estado, String localidade) {
				super();
				this.piso = piso;
				this.comprimento = comprimento;
				this.estado = estado;
				this.localidade = localidade;
			}
			

		// =======================================================
		// =================== COMPORTAMENTOS ==================
		// =======================================================

	


		// =======================================================
		// ============== MÉTODOS COMPLEMENTARES ==============
		// =======================================================

		// ----> toString()
			

		// ----> equals()
}
