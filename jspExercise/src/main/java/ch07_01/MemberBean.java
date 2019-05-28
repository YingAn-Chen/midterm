package ch07_01;

import java.io.Serializable;

public class MemberBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String fullname;
	private String shortname;
	private String industry;
	private String adress;
	private String chairman;
	private String manager;
	private String spokersman;
	private String telephone;

	public MemberBean() {
	}

	public MemberBean(int id, String fullname, String shortname, String industry, String adress, String chairman,
			String manager, String spokersman, String telephone) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.shortname = shortname;
		this.industry = industry;
		this.adress = adress;
		this.chairman = chairman;
		this.manager = manager;
		this.spokersman = spokersman;
		this.telephone = telephone;

	}
	

	public String toString() {
		return "[" + id + "," + fullname + "," + shortname + "," + industry + "," + adress + "," + chairman + ","
				+ manager + "," + spokersman + "," + telephone + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getShortname() {
		return shortname;
	}

	public void setShortname(String shortname) {
		this.shortname = shortname;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getChairman() {
		return chairman;
	}

	public void setChairman(String chairman) {
		this.chairman = chairman;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getSpokersman() {
		return spokersman;
	}

	public void setSpokersman(String spokersman) {
		this.spokersman = spokersman;

	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void setId(String id2) {
		// TODO Auto-generated method stub
		
	}
}