package com.tosproject.grpcenterprise;

import com.tosproject.grpcenterprise.LoginServiceGrpc.LoginServiceImplBase;

import io.grpc.stub.StreamObserver;

public class loginService extends LoginServiceImplBase{

	@Override
	public void login(LoginRequest request, StreamObserver<LoginResponse> responseObserver) {
		System.out.println("Loign here");
		String firstname = request.getFirstname();
		String lastname = request.getLastname();
		int membershipNumber =request.getMembershipNumber();
		LoginResponse.Builder response = LoginResponse.newBuilder();
		
		if(membershipNumber == (12345)) {
			//return valid member message
			response.setMessage(lastname).setMessage("Valid Member");
		}
		else {
			
			//return invalid member message
			response.setMessage(lastname).setMessage("invalid Member");
		}
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

	

}
