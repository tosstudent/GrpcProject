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

		String ambulancequestion = request.getAmbulancequestion();
		System.out.println("Please confirm you need an ambulance");
		
		ConfirmResponse.Builder response = ConfirmResponse.newBuilder();
		response.setConfirmambulance("I need an ambulance");
	}

	@Override
	public void address(AddressRequest request, StreamObserver<AddressResponse> responseObserver) {
		String addressquestion = request.getAddressquestion();
		ConfirmResponse.Builder response =  ConfirmResponse.newBuilder();
		response.setAdressconfirm("My address is Newlands Cross, Dublin 15");
		
		
		responseObserver.onNext(response.build());
		//complete the RPC call
		responseObserver.onCompleted();

	}

}
