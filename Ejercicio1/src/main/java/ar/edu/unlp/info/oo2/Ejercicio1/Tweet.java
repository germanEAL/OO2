package ar.edu.unlp.info.oo2.Ejercicio1;

public class Tweet {
	
		private String texto;
		private Tweet origen;

		
		public String getTexto() {
			return texto;
		}

		public Tweet getOrigen() {
			return origen;
		}
		public Tweet() {
			
		}
		public Tweet(String texto) {
			this.texto=texto;
		}
		
		public void esRetweet(Tweet unTweet) {
			this.origen=unTweet;
		}
		
		
		
		
		
}
