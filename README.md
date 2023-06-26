<h1 align="center" style="">Let's Blog</h1>
<h3 align="center" style="">Contributors: <a href="https://github.com/RaviPrakash1264">@RaviPrakash1264</a></h3>
<h4 align="center">A complete backend solution for a blogging application which provides numerous functionalities to the frontend teams.It helps users to create,delete,update,sort,search and
categorize a post according to a particular category.Posts are divided into different pages using pagination.Users will be able to add,delete and update comments on a post as well.It consists of different user input validation and exception handling along with role based authorization.JWT based
authentication has been used to secure the APIs.Along with the above features this backend solution is going to provide the detailed documentation to the frontend teams with the
help of swagger ui so that they can easily consume the APIs.  
</h4>
<p align="center">
<img src="https://i.ibb.co/L50hVJG/Screenshot-2023-06-22-194416.jpg" alt="Logo" height="200" width="200">
</p>
<h4 align="center">
Frontend team will be provided with interface by swagger which contains six controllers i.e. auth,error,category,comment,post and user.
APIs in these controllers are secured by JWT authentication.User first have to enter the token before consuming the APIs.Auth controller
is going to contain the APIs for getting the info of particular user,registering the user and creation of token.Error controller is responsible
for the APIs involved in exception handling.In category controller user will be able to consume the APIs which help to fetch,delete,
update and save the post according to a category.Comment controller will provide the APIs for delete and create comments.Post controller is going 
to contain the most number of APIs.This is going to provide the APIs for getting a post by category,searching a post by title,fetching and saving the image
of a particular post.In addition to this it will help to update,delete and fetch the list of posts according to a particular id.User controller will be helpful
in providing the APIs which will update,delete and fetch a list of users collectively and according to id as well.Overall this backend solution
has used the concept of input validation on database,global exceptional handling,role based authorization,Stream API,advanced hibernate mappings,JWT authentication,pagination,searching and sorting.
</h4>


<h2 align="center">TECH STACK USED</h2>
<h4 align="center">
Java • Spring Boot • Hibernate • MySQL • Swagger
</h4>
<h2 align="center">LAYERED ARCHITECTURE USED IN THE PROJECT</h2>
<p align="center">
<img src="https://i.ibb.co/fNLwL2y/Layered-Architecture.jpg" alt="Untitled" border="0">
</p>
<h2 align="center">ER Diagram</h2>
<p align="center">
<img src="https://i.ibb.co/4TNyTWj/ER-Diagram.jpg" alt="Untitled" border="0">
</p>
<h2 align="center">LIST OF BACKEND FEATURES/MODULES</h2>
<p align="center">
<img src="https://i.ibb.co/zb5FNVP/Backend-modules.jpg" alt="Untitled" border="0">
</p>
<h2 align="center">SCREENSHOTS</h2>
<h3>1. REGISTER NEW USER WITH INPUT VALIDATION</h3>

<p align="center">
• INPUT VALIDATION
</p>
<p align="center">
<img src="https://i.ibb.co/rG37cjP/Register.jpg" alt="Picture2" border="0">
</p>
<p align="center">
• SUCCESSFUL REGISTRATION 
</p>
<p align="center">
<img src="https://i.ibb.co/820Vq7D/Register2.jpg" alt="Picture2" border="0">
</p>
<h3>2. LOGIN WITH EXCEPTION HANDLING AND GENERATING JWT TOKEN</h3>

<p align="center">
• EXCEPTION HANDLING
</p>
<p align="center">
<img src="https://i.ibb.co/DQPMYCW/login1.jpg" alt="Picture2" border="0">
</p>
<p align="center">
• SUCCESSFUL LOGIN
</p>
<p align="center">
<img src="https://i.ibb.co/Jdgq0tt/login2.jpg" alt="Picture6" border="0">
</p>
<h3>3. ADD,UPDATE,FETCH AND DELETE CATEGORIES WITH INPUT VALIDATION AND EXCEPTION HANDLING</h3>

<p align="center">
• INPUT VALIDATION
</p>
<p align="center">
<img src="https://i.ibb.co/5MHBQCD/Category1.jpg" alt="Picture8" border="0">
</p>
<p align="center">
• ADDING CATEGORIES
</p>
<p align="center">
<img src="https://i.ibb.co/BPtmVTb/Category2.jpg" alt="Picture8" border="0">
</p>
<p align="center">
• UPDATING CATEGORIES BY ID
</p>
<p align="center">
<img src="https://i.ibb.co/MhqxZKw/Category3.jpg" alt="Picture5" border="0">
</p>
<p align="center">
• GETTING CATEGORIES BY ID
</p>
<p align="center">
<img src="https://i.ibb.co/W2gnbRr/Category4.jpg" alt="Picture5" border="0">
</p>
<p align="center">
• GETTING LIST OF CATEGORIES
</p>
<p align="center">
<img src="https://i.ibb.co/mRBkHzT/Category5.jpg" alt="Category5" alt="Picture5" border="0">
</p>
<p align="center">
• DELETING CATEGORIES BY ID
</p>
<p align="center">
<img src="https://i.ibb.co/4gcd7vT/Category6.jpg" alt="Picture5" border="0">
</p>
<h3>4. ADD,UPDATE,FETCH AND DELETE POSTS WITH CATEGORY AND USER ID</h3>

<p align="center">
• ADDING POST BY CATEGORY AND USER ID
</p>
<p align="center">
<img src="https://i.ibb.co/g9H2f0k/post1.jpg" border="0">
</p>
<p align="center">
• GETTING POSTS BY USER ID
</p>
<p align="center">
<img src="https://i.ibb.co/19B43QF/post2.jpg" border="0">
</p>
<p align="center">
• GETTING POSTS BY CATEGORY ID
</p>
<p align="center">
<img src="https://i.ibb.co/Xx0qb8s/post3.jpg" border="0">
</p>
<p align="center">
• GETTING LIST OF POSTS
</p>
<p align="center">
<img src="https://i.ibb.co/yVhcQHy/post4.jpg" border="0">
</p>
<p align="center">
• GETTING POST BY ID
</p>
<p align="center">
<img src="https://i.ibb.co/stnjy0p/post5.jpg" border="0">
</p>
<p align="center">
• UPDATING POST BY ID
</p>
<p align="center">
<img src="https://i.ibb.co/VDrW4hV/post6.jpg" border="0">
</p>
<p align="center">
• DELETING POST BY ID
</p>
<p align="center">
<img src="https://i.ibb.co/LSBnbK1/post7.jpg" border="0">
</p>
<h3>5. PAGINATION</h3>

<p align="center">
• GETTING POST BY PAGE NUMBER AND PAGE SIZE
</p>
<p align="center">
<img src="https://i.ibb.co/gPbySLF/pagination1.jpg" border="0">
</p>

<p align="center">
<img src="https://i.ibb.co/1fB1WfL/pagination2.jpg" border="0">
</p>
<h3>6. SORTING</h3>

<p align="center">
• SORTING POST BY POST ID AND IN ASCENDING ORDER
</p>
<p align="center">
<img src="https://i.ibb.co/MctPftz/sorting1.jpg" border="0">
</p>
<p align="center">
• SORTING POST BY POST TITLE AND IN DESCENDING ORDER
</p>
<p align="center">
<img src="https://i.ibb.co/Qk6S8dR/sorting2.jpg" border="0">
</p>
<h3>7. SEARCHING</h3>

<p align="center">
<img src="https://i.ibb.co/Jq6Zy2G/search1.jpg" border="0">
</p>
<h3>8. ADDING AND FETCHING IMAGE</h3>

<p align="center">
• ADDING IMAGE BY POST ID
</p>
<p align="center">
<img src="https://i.ibb.co/ZWXXVdd/image1.jpg" border="0">
</p>
<p align="center">
• FETCHING IMAGE BY IMAGE NAME
</p>
<p align="center">
<img src="https://i.ibb.co/yQ30LgQ/image2.jpg" border="0">
</p>
<h3>9. ADD and DELETE COMMENTS</h3>

<p align="center">
• ADDING COMMENTS BY POST ID
</p>
<p align="center">
<img src="https://i.ibb.co/4KMnMDG/comment1.jpg" border="0">
</p>
<p align="center">
• DELETING COMMENTS BY COMMENT ID
</p>
<p align="center">
<img src="https://i.ibb.co/bPx2QC0/comment2.jpg" border="0">
</p>
<h3>10. ROLE-BASED AUTHORIZATION</h3>

<p align="center">
• DELETING USING NORMAL USER
</p>
<p align="center">
<img src="https://i.ibb.co/8xn9WJT/role-based1.jpg" border="0">
</p>
<p align="center">
• DELETING USING ADMIN USER
</p>
<p align="center">
<img src="https://i.ibb.co/QfDXL7J/role-based2.jpg" border="0">
</p>
<h3>11. APIS DOCUMENTATION USING SWAGGER</h3>

<p align="center">
<img src="https://i.ibb.co/R9BPmC4/swagger1.jpg" border="0">
</p>
<p align="center">
<img src="https://i.ibb.co/bvPSQPd/swagger2.jpg" border="0">
</p>

<h2 align="center">REFERENCES</h2>

<ul>
<li>
SPRING BOOT DOCUMENTATION
https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/
</li>
<li>
SWAGGER DOCUMENTATION
https://swagger.io/docs/
</li>
 <li>
HIBERNATE DOCUMENTATION
https://hibernate.org/orm/documentation/6.2/
</li>
<li>
STACKOVERFLOW FOR FIXING BUGS
https://stackoverflow.com/
</li>
<li>
JWT DOCUMENTATION
https://jwt.io/introduction
</li>
</ul>