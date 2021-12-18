# StudentWebAppDemo
Practicing using Spring Boot for Java Web App

This small project is just me experimenting with Spring Boot Framework for Java
The application will be a small student management system

12-17
1. Created a new Spring boot application with web dependicies and postgress database
2. add param @RestController and @GetMapping while testing spring boots beginner doc of creating a hello method
3. return method to say "Hello, world"
4. To make things more complicated, I created a seperate package called 'student' and created the class 'Student' inside.
5. created a constructor for id, name, email, age and dob as well as set and get methods for each param
6. return list of new student

public List <Student> hello(){
		return List.of(new Student(1L,"Mariam","mariam@gmail.com",21, LocalDate.of(2000,9,23)));
	}
 
  
![return json list](https://user-images.githubusercontent.com/70227588/146631556-d209108a-59c5-451b-8488-8be60d9a662b.JPG)
