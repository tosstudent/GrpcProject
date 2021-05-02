package com.tosproject.grpcenterprise;

import java.io.IOException;

import com.tosproject.grpcenterprise.LoginServiceGrpc.LoginServiceImplBase;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class LoginServer extends LoginServiceImplBase{
	
	//server port
		public static void main(String[] args) throws IOException, InterruptedException {
		Server server = ServerBuilder.forPort(48051).addService(new LoginServer()).build();
		server.start();
		System.out.println("Server started at " + server.getPort());
		server.awaitTermination();
		}
	 
	
	//service implementation
	
	@Override
	public void login(LoginRequest request, StreamObserver<LoginResponse> responseObserver) {
		
		
		String firstname = request.getFirstname();
		String lastname = request.getLastname();
		int membershipNumber =request.getMembershipNumber();
		String message = "Welcome"  +  firstname + "Your membership is valid, welcome to Cornelius Emergency Service ";
		LoginResponse.Builder response = LoginResponse.newBuilder();
		response.setMessage(message);
		
		//send the RPC response
		responseObserver.onNext(response.build());
		//complete the RPC call
		responseObserver.onCompleted();
	}
}

