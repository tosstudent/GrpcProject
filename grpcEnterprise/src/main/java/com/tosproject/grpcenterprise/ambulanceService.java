package com.tosproject.grpcenterprise;

import com.tosproject.grpcenterprise.AmbulanceServiceGrpc.AmbulanceServiceImplBase;

import io.grpc.stub.StreamObserver;

public class ambulanceService extends AmbulanceServiceImplBase{

	@Override
	public void ambulance(AmbulanceRequest request, StreamObserver<ConfirmResponse> responseObserver) {
		
		
	}

	@Override
	public void address(AddressRequest request, StreamObserver<AddressResponse> responseObserver) {
		
	}
	

	

}
