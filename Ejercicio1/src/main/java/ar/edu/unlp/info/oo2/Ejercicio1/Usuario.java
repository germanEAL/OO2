package ar.edu.unlp.info.oo2.Ejercicio1;

import java.util.*;
public class Usuario {
	
	private String screenName;
	private List<Tweet> tweets;
	
	public Usuario(String screenName) {
		this.screenName=screenName;
		this.tweets= new ArrayList<>();
	}
	
	public String getScreenName() {
		return this.screenName;
	}
	
	private boolean verificarTexto(String testo) {
		return !((testo.length()>1) && (testo.length()<140));
	}
	
	public void escribirTweet(String testo) {
		
		if (verificarTexto(testo)) {
			Tweet t= new Tweet(testo);
			añadirTweet(t);
		}
		else {
			System.out.print("Los tweets no pueden ser menor a 1 caracter o mayor a 140");
		}
	}
	private void añadirTweet(Tweet unTweet) {
		this.tweets.add(unTweet);
	}
	
	public void retwittear(Tweet t) {
		Tweet tw = new Tweet();
		tw.esRetweet(t);
		añadirTweet(tw);
	}
	
	private void borrarTweets() {
		this.tweets.clear();
	}
	
	public void borrarTweets(Usuario u) {
		u.borrarTweets();
	}
}
