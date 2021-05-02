package com.tosproject.grpcenterprise;

import com.tosproject.grpcenterprise.LoginServiceGrpc.LoginServiceBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class LoginClient {

	public static void main(String[] args) {
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 48051).usePlaintext().build();
		
		LoginServiceBlockingStub LoginServiceStub = LoginServiceGrpc.newBlockingStub(channel);
		
		LoginRequest loginrequest = LoginRequest.newBuilder().setFirstname("Samuel").setLastname("Kelly").setMembershipNumber(12345).build();
		LoginResponse response = LoginServiceStub.login(loginrequest);
		
		System.out.println(response.getMessage());
		System.out.println("Shutting down channel");
		channel.shutdown();
		
	}

}
