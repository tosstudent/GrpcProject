package com.tosproject.grpcenterprise;

import com.tosproject.grpcenterprise.AmbulanceServiceGrpc.AmbulanceServiceBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class AmbulanceClient {

	public static void main(String[] args) {

		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 55165).usePlaintext().build();
		AmbulanceServiceBlockingStub AmbulanceServiceStub = AmbulanceServiceGrpc.newBlockingStub(channel);
		AmbulanceRequest ambulancerequest= AmbulanceRequest.newBuilder().setAmbulancequestion("Please confirm you need an ambulance").build();
	
		
		
		ConfirmResponse response = AmbulanceServiceStub.ambulance(ambulancerequest);
		System.out.println(response.getConfirmambulance());
	
		System.out.println("Shutting down channel");
		channel.shutdown();
		
	}

}
