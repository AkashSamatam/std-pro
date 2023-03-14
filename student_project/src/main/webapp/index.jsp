<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<%@include file ="css.jsp" %>

<body>
<%@include file="Navbar.jsp" %>

	<section class="h-100 bg-dark">
		<div class="container py-5 h-100">
			<div
				class="row d-flex justify-content-center align-items-center h-100">
				<div class="col">
					<div class="card card-registration my-4">
						<div class="row g-0">
							<div class="col-xl-6 d-none d-xl-block">
								<img
									src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/img4.webp"
									alt="Sample photo" class="img-fluid"
									style="border-top-left-radius: .25rem; border-bottom-left-radius: .25rem;" />
							</div>
							<div class="col-xl-6">
								<div class="card-body p-md-5 text-black">
									<h3 class="mb-5 text-uppercase">Student registration form</h3>
<form action="Registration" method="post">
									<div class="row">
										<div class="col-md-6 mb-4">
											<div class="form-outline">
												<input type="text" id="form3Example1m" name="rollnumber"
													class="form-control form-control-lg" /> <label
													class="form-label" for="form3Example1m">rollnumber</label>
											</div>
											</div>
										<div class="col-md-6 mb-4">
											<div class="form-outline">
												<input type="text" id="form3Example1m" name="Firstname"
													class="form-control form-control-lg" /> <label
													class="form-label" for="form3Example1m">First name</label>
											</div>
										</div>
										<div class="col-md-6 mb-4">
											<div class="form-outline">
												<input type="text" id="form3Example1n" name="lastname"
													class="form-control form-control-lg" /> <label
													class="form-label" for="form3Example1n">Last name</label>
											</div>
										</div>
									</div>

									<div class="row">
										<div class="col-md-6 mb-4">
											<div class="form-outline">
												<input type="text" id="form3Example1m1" name="username"
													class="form-control form-control-lg" /> <label
													class="form-label" for="form3Example1m1">User
													name</label>
											</div>
										</div>
									</div>

									<div class="form-outline mb-4">
										<input type="email" id="form3Example97" name="Email"
										pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$"
											class="form-control form-control-lg" /> <label
											class="form-label" for="form3Example97" >Email ID</label>
									</div>
									
									<div class="form-outline mb-4">
										<input type="password" id="form3Example97" name="password"
											class="form-control form-control-lg" /> <label
											class="form-label" for="form3Example97" >Password</label>
									</div>

									
											<input type ="submit">
</form>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<%@ include file="Footer.jsp" %>


	

</body>
</html>