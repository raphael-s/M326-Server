package network.server;

import network.Message;

/**
 * Diese Schnittstelle muss von einer Klasse innerhalb der Bomberman-Server-Komponente
 * implementiert werden. Sie erlaubt dem Server-Objekt der Netzwerkschicht, von den 
 * Clients empfangene Nachrichten zur Verarbeitung an die Applikationsschicht weiterzuleiten.
 * 
 * @author Andres Scheidegger
 *
 */
public interface ServerApplicationInterface {
  
  /**
   * Diese Methode wird vom Server-Objekt aufgerufen, wenn eine Nachricht von einem Client
   * empfangen wurde.
   * @param message Das empfangene Nachrichtenobjekt.
   * @param connectionId Die Netzwerkverbindung, �ber welche die Nachricht empfangen wurde
   * (repr�sentiert den Client).
   */
  public abstract void handleMessage(Message message, String connectionId);
}
