package MayWeek1;

public class SwitchCaseCode {

	public static void main(String[] args) {
		System.out.println(LaunchBrowser(""));
		System.out.println(LaunchBrowser("abc"));
		System.out.println(LaunchBrowser("Chrome"));
		System.out.println(LaunchBrowser("SaFaRI"));
		System.out.println(LaunchBrowser(null));
		
		
		System.out.println("************************");
		System.out.println(testEnvironmentSelection(null));
		System.out.println(testEnvironmentSelection(""));
		System.out.println(testEnvironmentSelection("qa"));
		System.out.println(testEnvironmentSelection("Q"));
		System.out.println(testEnvironmentSelection("DEV"));

	}
	
	
	public static String LaunchBrowser(String browserName) {
		
		if(browserName == null || browserName.isBlank()) {
			return "Browser can not be empty";
		}
		
		
		switch(browserName.toLowerCase().trim()) {
			
		case "chrome" : return "Launching Chrome Browser";
		case "edge"   : return "Launching Edge Browser";
		case "safari" : return "Launching Safari Browser";
		case "firefox": return "Launching Firefox Browser";	
		default : return "Please select the right browser:" +browserName;
		
		}
		
	}
	
	public static String testEnvironmentSelection(String envName) {
		
		
		if(envName ==null || envName.isBlank()) {
			return "Environment name cannot be empty/blank";
		}
		
		switch(envName.toLowerCase().trim()) {
			
		case "qa"    : return "https://qa.example.com";
		case "dev"   : return "https://dev.example.com";
		case "stage" : return "https://stage.example.com";
		default      : return "Please select the correct instance"; 
		}
	}

}
