# StudentWebAppDemo
Practicing using Spring Boot for Java Web App

This small project is just me experimenting with Spring Boot Framework for Java
The application will be a small student management system based off the customer example from spring.io
						client
Top level down hierarchy for web app    --> api layer --> [get put post delete] methods
					--> server layer  --> logic for managing students
					--> data access layer -->
					--> database (postgres)

12-17
1. Created a new Spring boot application with web dependicies and postgress database
![initial spring setup](https://user-images.githubusercontent.com/70227588/146634238-6f498ce2-5c69-4734-bc6c-e9e71667b35c.JPG)

3. add param @RestController and @GetMapping while testing spring boots beginner doc of creating a hello method
4. return method to say "Hello, world"
5. To make things more complicated, I created a seperate package called 'student' and created the class 'Student' inside.
6. created a constructor for id, name, email, age and dob as well as set and get methods for each param
7. return list of new student

public List <Student> hello(){
		return List.of(new Student(1L,"Mariam","mariam@gmail.com",21, LocalDate.of(2000,9,23)));
	}
 
  
![return json list](https://user-images.githubusercontent.com/70227588/146631556-d209108a-59c5-451b-8488-8be60d9a662b.JPG)

7. This list is being directly accessed but now I needed to create an api layer instead and set the end points
8. Created new StudentController class (api layer) in student package and set path while still printin the json object of students
	at the new endpoint
	
9. Create StudentService class which now hosts method for returning student objects so the method that was used in StudentController is now used in StudentServices
10. Dependcy Injection -- splitting layers of code into level hierarchy shown above. So far the layers created in code are the api layer, service layer, then data access layer
	
	
