package br.com.kamehouse.profilecategorymanager.adapter;

import br.com.kamehouse.profilecategorymanager.CategoryServiceGrpc;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.stereotype.Service;

@GrpcService
@Service
@RequiredArgsConstructor
public class CategoryAdapter extends CategoryServiceGrpc.CategoryServiceImplBase {

}
