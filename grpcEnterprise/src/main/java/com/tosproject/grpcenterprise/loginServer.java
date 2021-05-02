package com.tosproject.grpcenterprise;

import java.io.IOException;

import com.tosproject.grpcenterprise.LoginServiceGrpc.LoginServiceImplBase;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class loginServer extends LoginServiceImplBase{
	
	//server port
		public static void main(String[] args) throws IOException, InterruptedException {
		Server server = ServerBuilder.forPort(48051).addService(new loginServer()).build();
		server.start();
		System.out.println("Server started at " + server.getPort());
		server.awaitTermination();
		}
	 
	
	//service implementation
	@SuppressWarnings("unused")
	@Override
	public void login(LoginRequest request, StreamObserver<LoginResponse> responseObserver) {
		
		
		System.out.println("Loign here");
		String firstname = request.getFirstname();
		String lastname = request.getLastname();
		int membershipNumber =request.getMembershipNumber();
		LoginResponse.Builder response = LoginResponse.newBuilder();
		
		if(membershipNumber <= (899887798)) {
			//return valid member message
			response.setMessage(lastname).setMessage("Your membership is valid, welccome to Cornelius Emergency Service ");
		}
		else {
			
			//return invalid member message
			response.setMessage(lastname).setMessage("invalid Member");
		}
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}
}

