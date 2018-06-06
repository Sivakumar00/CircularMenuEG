# Circular Menu Android
It is an example of circular menu in android

## Dependencies

1)In this project, build.gradle (project level) should be added with maven.


```
allprojects {
    repositories {
        ...
        jcenter()
        maven{ url "https://jitpack.io"}
    }
}
```

2) Add App level dependencies:

```
dependencies {
  compile 'com.github.Hitomis:CircleMenu:v1.1.0'
  }
```


public static boolean isEmail(String email) throws TransformException {
	// Your code here
 boolean checkEndDot  = false;
        checkEndDot = email.endsWith(".");

        // Code to find out last index of '@' sign
        int indexOfAt = email.indexOf('@');
        int lastIndexOfAt = email.lastIndexOf('.');


        //Code to check occurence of @ in the email address  
        int countOfAt = 0;

        for (int i = 0; i < email.length(); i++) {
            if(email.charAt(i)=='@')
                countOfAt++; }


        // Code to check occurence of [period sign i..e, "."] after @ 
        String buffering = email.substring(email.indexOf('@')+1, email.length());
        int len = buffering.length();

        int countOfDotAfterAt = 0;
        for (int i=0; i < len; i++) {
            if(buffering.charAt(i)=='.')
                countOfDotAfterAt++; }


// Code to print userName & domainName
            String userName = email.substring(0, email.indexOf('@'));
            String domainName = email.substring(email.indexOf('@')+1, email.length());

                System.out.println("\n");   

               if ((countOfAt==1) && (userName.endsWith(".")==false)  && (countOfDotAfterAt ==1) &&   
                  ((indexOfAt+3) <= (lastIndexOfAt) && !checkEndDot)) {

                   return true;
                   }

               else {       
                       return false;
                        }


}
