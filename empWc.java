class emp {
	String name;
	int age;
	String role;

	public static void main(String[] args) {
		emp HR = new emp();
		HR.name = "Asha";
		HR.age = 28;
		HR.role = "HR";

		emp IT = new emp();
		IT.name = "Rahul";
		IT.age = 30;
		IT.role = "IT";

		emp Accounts = new emp();
		Accounts.name = "Priya";
		Accounts.age = 26;
		Accounts.role = "Accounts";

		System.out.println(HR.name + " - " + HR.age + " - " + HR.role);
		System.out.println(IT.name + " - " + IT.age + " - " + IT.role);
		System.out.println(Accounts.name + " - " + Accounts.age + " - " + Accounts.role);
	}
}
