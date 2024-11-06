package br.com.kamehouse.profilecategorymanager.core.usecase;

public class CategoryUsecase {
}

/*
package br.com.kamehouse.profilecategorymanager.grpc;

import br.com.kamehouse.profilecategorymanager.grpc.CategoryServiceGrpc.CategoryServiceImplBase;
import br.com.kamehouse.profilecategorymanager.grpc.CategoryServiceProto.*;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends CategoryServiceImplBase {

    @Override
    public void createCategory(Category request, StreamObserver<CategoryId> responseObserver) {
        // Implementação do método createCategory
        CategoryId categoryId = CategoryId.newBuilder().setId("generated-id").build();
        responseObserver.onNext(categoryId);
        responseObserver.onCompleted();
    }

    @Override
    public void getCategory(CategoryId request, StreamObserver<Category> responseObserver) {
        // Implementação do método getCategory
        Category category = Category.newBuilder()
                .setName("Sample Name")
                .setDescription("Sample Description")
                .setCreatedAt("2023-01-01T00:00:00")
                .setUpdatedAt("2023-01-01T00:00:00")
                .build();
        responseObserver.onNext(category);
        responseObserver.onCompleted();
    }

    @Override
    public void updateCategory(Category request, StreamObserver<Category> responseObserver) {
        // Implementação do método updateCategory
        responseObserver.onNext(request);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteCategory(CategoryId request, StreamObserver<CategoryId> responseObserver) {
        // Implementação do método deleteCategory
        responseObserver.onNext(request);
        responseObserver.onCompleted();
    }

    @Override
    public void listCategories(com.google.protobuf.Empty request, StreamObserver<CategoryList> responseObserver) {
        // Implementação do método listCategories
        CategoryList categoryList = CategoryList.newBuilder().build();
        responseObserver.onNext(categoryList);
        responseObserver.onCompleted();
    }
}
 */