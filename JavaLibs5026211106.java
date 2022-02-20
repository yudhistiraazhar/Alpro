import java.util.Scanner;

public class JavaLibs5026211106 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
			System.out.print("Siapakah namamu?:");
			String name = sc.next();

			System.out.print("Dimana kamu kuliah?:");
			String university = sc.next();
			
			System.out.print("Berada di kota mana kampusmu?:");
			String city = sc.next();

			System.out.print("Umur mu berapa?:");
			int age = sc.nextInt();

			System.out.print("Berapa jarak kampus dari rumahmu dalam kilometer?:");
			double distance = sc.nextDouble();
			
			System.out.print("Berapakah umur kakakmu?:");
			int age2 = sc.nextInt();

			int age3 = age2 - age;

			System.out.print("Apakah hal yang kamu lakukan saat senggang?:");
			String hobby = sc.next();

			System.out.print("Siapakah panutanmu saat ini?:");
			String idol = sc.next();

			System.out.print("Berapakah jarak sekolah mu yang lama dari rumah?:");
			double distance2 = sc.nextDouble();

			double distance3 = distance + distance2;

			System.out.print("Sebutkan dosen favoritmu!:");
			String lecturer = sc.next();
			
			System.out.println("Hai, namaku adalah " + name);
			System.out.println("Aku belajar di " + university + " yang berada di kota " + city);
			System.out.println("Sekarang aku berumur " + age + " tahun");
			System.out.println("Jarak rumahku dari universitas adalah " + distance + " km");
			System.out.println("Umur aku dan kakak aku terpaut " + age3 + " tahun");
			System.out.println("Hobby ku adalah " + hobby + " dikala senggang");
			System.out.println("Seorang yang aku idolai adalah " + idol);
			System.out.println("Jika aku harus ke SMA yang lama dulu baru ke kampus, maka akan menempuh " + distance3 + " km");
			System.out.println("Dosen favoritku adalah " + lecturer);
			

			sc.close();
	}
}
			

	