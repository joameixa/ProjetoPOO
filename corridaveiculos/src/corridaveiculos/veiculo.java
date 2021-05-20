package corridaveiculos;

//import java.util.ArrayList;
//import java.util.List;

public class veiculo {
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	
		//Aspetos do Veiculo 
		private String marca;	
		private String matricula;
		private String cor;
		private String modelo;	
		private String pneus; // Tamanho dos pneus 
		
		private boolean ligado;
		private double posicao;
		private boolean travado;
			

	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public String getMatricula() {
			return matricula;
		}
		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}
		public String getCor() {
			return cor;
		}
		public void setCor(String cor) {
			this.cor = cor;
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public String getPneus() {
			return pneus;
		}
		public void setPneus(String pneus) {
			this.pneus = pneus;
		}
	// =======================================================
	// =================== CONSTRUTORES =====================
	// ======================================================= 
	    
		// CONSTRUTOR DEFAULT
		public veiculo()
		{
			
		}

	    // CONSTRUTOR COM PARÂMETROS
		public veiculo(String marca, String matricula, String cor, String modelo) {
			super();
			this.marca = marca;
			this.matricula = matricula;
			this.cor = cor;
			this.modelo = modelo;
		}


	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================

		public boolean ligar()
		{
			if (this.ligado)
			{
				return false;
			}
			
			this.ligado = true;
			
			return true;
		}
		
		public boolean desligar()
		{
			if (this.ligado)
			{
				return true;
			}
			
			this.ligado = false;
			
			return false;
		}
		
		public double avancar(double kms)
		{
			if (this.ligado && !this.travado)
			{
				this.posicao += kms; 
				
			}
			
			return this.posicao;
			
		}
		
		public double recuar(double kms)
		{
			if (this.ligado && !this.travado)
			{
				this.posicao -= kms; 
				
			}
			
			return this.posicao;
		}
		
		public boolean travar()
		{
			if (this.travado)
			{
				return false;
			}
			
			this.travado = true;
			
			return true;
		}
		
		public boolean destravar()
		{
			if (this.travado)
			{
				this.travado = true;
				return true;
			}
			
			return false;
		}
		


	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
	// =======================================================

	// ----> toString()
		@Override
		public String toString() {
			return "Carro [marca=" + marca + ", matricula=" + matricula + ", cor=" + cor + ", modelo=" + modelo
					+ ", ligado=" + ligado + ", posicao=" + posicao + ", travado=" + travado + "]";
		}
		


	// ----> equals()
	}
