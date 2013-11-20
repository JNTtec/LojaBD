package manageBean;

import javax.faces.bean.ManagedBean;

import model.Login;



@ManagedBean
public class LoginMB {
	
		Login login;
		
		
		private LoginMB(){
						
			login = new Login();
		}
		
		public String getUsuario(){
			
			return login.getUsuario();
		}
		
		public void setUsuario(String usuario){
			this.login.setUsuario(usuario);
			
		}
		
		
	

}

