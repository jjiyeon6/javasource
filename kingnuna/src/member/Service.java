package member;

public interface Service {
	void addMember(Member m);

	boolean checkDupId(String id);

	boolean login(String id, String pwd);

	Member getMember(String id);

	void editMember(Member m);

	void delMember(String id);
}
