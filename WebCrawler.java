package vjezba11_1;

import java.util.ArrayList;
import java.util.Scanner;

public class WebCrawler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter a URL: ");
		String url = input.nextLine();
		crawler(url); // Traverse the Web from the a starting url
		}
		
		public static void crawler(String startingURL) {
		ArrayList<String> listOfPendingURLs = new ArrayList<>();
		ArrayList<String> listOfTraversedURLs = new ArrayList<>();
		int count = 0;
		listOfPendingURLs.add(startingURL);
			while (!listOfPendingURLs.isEmpty() && listOfTraversedURLs.size() <= 10) {
				String urlString = listOfPendingURLs.remove(0);
				if (!listOfTraversedURLs.contains(urlString)) {
					listOfTraversedURLs.add(urlString);
					System.out.println("Craw " + urlString + " " + count++);
		
		for (String s: getSubURLs(urlString)) {
			if (!listOfTraversedURLs.contains(s))
				listOfPendingURLs.add(s);
				}
			}
		}
	}
		
	public static ArrayList<String> getSubURLs(String urlString) {
		ArrayList<String> list = new ArrayList<>();
		
		try {
			java.net.URL url = new java.net.URL(urlString);
				Scanner input = new Scanner(url.openStream());
				int current = 0;
					while (input.hasNext()) {
						String line = input.nextLine();
						current = line.indexOf("http:", current);
							while (current > 0) {
								int endIndex = line.indexOf("\"", current);
									if (endIndex > 0) { // Ensure that a correct URL is found
										list.add(line.substring(current, endIndex));
										current = line.indexOf("http:", endIndex);
										}
									else
										current = -1;
									}
								}
							}
						catch (Exception ex) {
							System.out.println("Error: " + ex.getMessage());
						}
					
			return list;
	}
}
