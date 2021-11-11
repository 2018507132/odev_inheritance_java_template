package ybs.oop.project1;

public class Main {

	public static void main(String[] args) {	
		calc(5);
	}
	
	public static void calc(int limit){
		
		Öncelikle bu sınıfla aynı klasörde bir Calculator sınıfı oluşturunuz.
		Sınıf dosyasının ilk satırına yukarıdaki package satırını aynen yazınız.
		Calculator sınıfı constructor methodu içerisine parametre almasın.
		Calculator sınıfına adı fibonacci, parametresi int limit olan, geri dönüş değeri int olan public
		bir method yazınız. Bu method recursive olarak geriye doğru gidip fibonacci sayılarını hesaplamalı.
		fibonacci sayıları kendinden önce yer alan iki sayının toplamı şeklinde örüntü oluşturan sayılardır.
		örneğin 1,1,2,3,5,8,13,21,34,55... şeklinde devam eder.
		fibonacci sayılarının ilk ikisi 1,1 olarak kabul edilmelidir. Parametre olarak alınan  limit ise 
		kaçıncı fibonacci sayısını bulmak istediğinizi belirtmek için kullanılacaktır. 
		Oluşturduğunuz Calculator sınıfından adını kendiniz belirleyeceğiniz 
		yeni bir instance oluşturunuz. Oluşturduğunuz instance a ait fibonacci metodunu limit parametresi ile
		çalıştırıp dönen sonucu ekrana yazınız. 		
		bu method içerisindeki tüm yazıları silerek kodlarınızı buraya yazınız.
		
	}
}
