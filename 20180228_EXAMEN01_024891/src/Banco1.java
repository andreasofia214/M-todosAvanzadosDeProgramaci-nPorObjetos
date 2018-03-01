
public class Banco1 implements Banco, Transaccion{

	public String tran, stat, dest, formato, protocol, usuario;
	
	public String update(String usuario, String dest, String protocol) {
		this.usuario = usuario;
		this.dest = dest;
		this.protocol = protocol;
		return "banco1";
	}
	
	public void Prot (String protocol){
		this.protocol = protocol;
		if (stat.equals("salida")){
			System.out.println("Transacción en proceso con un .json");
		}
		else{
			System.out.println("Fallo");
		}
	}
	
	public void Formato(String formato){
		this.formato = formato;
	}
	
	public String Us(String usuario){
		if(usuario.equals("usuario1")){
			System.out.println("Usuario 1 pertenece a banco 1");
		}else if(usuario.equals("usuario2")){
			System.out.println("Usuario 2 pertenece a banco 1");
		}else if(usuario.equals("usuario3")){
			System.out.println("Usuario 3 pertenece a banco 1");
	}
		return usuario;
		
	}

	@Override
	public void Status(String status) {
		// TODO Auto-generated method stub
		
	}
	
}
