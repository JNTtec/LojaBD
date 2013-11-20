package model;


public class Login {
	
	
	    private String usuario;
		private String senha;
		private boolean logado;
		
		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}
		public String getUsuario() {
			return usuario;
		}
		public void setSenha(String senha) {
			this.senha = senha;
		}
		public String getSenha() {
			return senha;
		}
		
		
		public void setLogado(boolean logado) {
			this.logado = logado;
		}
		
		public boolean isLogado() {
			return logado;
		}
	
}
