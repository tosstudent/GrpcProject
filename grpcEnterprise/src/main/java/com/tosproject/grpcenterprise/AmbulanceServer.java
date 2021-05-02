package com.tosproject.grpcenterprise;

import java.io.IOException;

import com.tosproject.grpcenterprise.AmbulanceServiceGrpc.AmbulanceServiceImplBase;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class AmbulanceServer extends AmbulanceServiceImplBase{
	

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//server port
		Server server = ServerBuilder.forPort(55165).addService(new AmbulanceServer()).build();
		server.start();
		System.out.println("Server started at " + server.getPort());
		server.awaitTermination();

	}

	@Override
	public void ambulance(AmbulanceRequest request, StreamObserver<ConfirmResponse> responseObserver) {

		String ambulancerequest = request.getAmbulancequestion();
		
		
		String response = request.getAmbulancequestion();
		String confirmambulance = "Please confirm you need an ambulance";
		ConfirmResponse result = ConfirmResponse.newBuilder()
			.setConfirmambulance(confirmambulance)
			.build();	
	}

	@Override
	public void address(AddressRequest request, StreamObserver<AddressResponse> responseObserver) {
		String addressrequest = request.getAddressquestion();
		String addressconfirm = ("I need an ambulance");
		AddressResponse response =  AddressResponse.newBuilder()
				.setAddressconfirm(addressconfirm)
				.build();
		
	
		responseObserver.onNext(response);
		//complete the RPC call
		responseObserver.onCompleted();

	}

}
