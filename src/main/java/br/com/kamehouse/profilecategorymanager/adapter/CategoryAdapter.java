package br.com.kamehouse.profilecategorymanager.adapter;

import br.com.kamehouse.profilecategorymanager.CategoryServiceGrpc;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class CategoryAdapter extends CategoryServiceGrpc.CategoryServiceImplBase {

}
