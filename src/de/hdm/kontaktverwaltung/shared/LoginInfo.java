package de.hdm.kontaktverwaltung.shared;

import java.io.Serializable;

/**
 * Diese Klasse ist Bestandteil des Login-Vorgangs über Google, um die Applikation nutzen zu
 * können
 * 
 * @author Florian Christein
 *
 */

public class LoginInfo implements Serializable {

 
private static final long serialVersionUID = 1L;
	
private boolean loggedIn = false;
  private String loginUrl;
  private String logoutUrl;
  private String emailAddress;
  private String nickname;

  public boolean isLoggedIn() {
    return loggedIn;
  }

  public void setLoggedIn(boolean loggedIn) {
    this.loggedIn = loggedIn;
  }

  public String getLoginUrl() {
    return loginUrl;
  }

  public void setLoginUrl(String loginUrl) {
    this.loginUrl = loginUrl;
  }

  /**
	 * Getter, der die Google Logout-URL zurückliefert
	 * 
	 * @return LogOutURL als String
	 */
  
  public String getLogoutUrl() {
    return logoutUrl;
  }

  public void setLogoutUrl(String logoutUrl) {
    this.logoutUrl = logoutUrl;
  }

  /**
	 * Getter, der die e-Mail Adresse des Users zurückliefert
	 * 
	 * @return Email als String
	 */
  
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }
}