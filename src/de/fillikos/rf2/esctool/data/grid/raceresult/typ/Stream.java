package de.fillikos.rf2.esctool.data.grid.raceresult.typ;

import jakarta.xml.bind.annotation.XmlElement;

import java.util.ArrayList;

public class Stream {

	private ArrayList<Meldung> chat, system, incident, sector, score;

	public Stream() {
		chat = new ArrayList<Meldung>();
		system = new ArrayList<Meldung>();
		incident = new ArrayList<Meldung>();
		sector = new ArrayList<Meldung>();
		score = new ArrayList<Meldung>();
	}

	@XmlElement(name = "Chat")
	public ArrayList<Meldung> getChat() {
		return chat;
	}

	public void setChat(ArrayList<Meldung> chat) {
		this.chat = chat;
	}

	@XmlElement(name = "System")
	public ArrayList<Meldung> getSystem() {
		return system;
	}

	public void setSystem(ArrayList<Meldung> system) {
		this.system = system;
	}

	@XmlElement(name = "Incident")
	public ArrayList<Meldung> getIncident() {
		return incident;
	}

	public void setIncident(ArrayList<Meldung> incident) {
		this.incident = incident;
	}

	@XmlElement(name = "Sector")
	public ArrayList<Meldung> getSector() {
		return sector;
	}

	public void setSectors(ArrayList<Meldung> sector) {
		this.sector = sector;
	}

	@XmlElement(name = "Score")
	public ArrayList<Meldung> getScore() {
		return score;
	}

	public void setScore(ArrayList<Meldung> score) {
		this.score = score;
	}


}
