package facefolks;

public class Customer extends Main {
	String name;
	String address;
	String contactNumber;
	String email;
	String proofType;
	String proofID;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProofType() {
		return proofType;
	}
	public void setProofType(String proofType) {
		this.proofType = proofType;
	}
	public String getProofID() {
		return proofID;
	}
	public void setProofID(String proofID) {
		this.proofID = proofID;
	}
	void registered()
	{
		System.out.println("Your details are as follows\nName: "+getName()+"\nAddress: "+getAddress()+"\nContact Number: "+getContactNumber()+"\nE-Mail ID: "+getEmail()+"\nProof type: "+getProofType()+"\nProof ID: "+getProofID());
	}

}
