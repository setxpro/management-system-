package br.com.setxpro.auth_user.domain.core.gateways;

import br.com.setxpro.auth_user.domain.core.entities.Collaborator;
import br.com.setxpro.auth_user.domain.dtos.CollaboratorDto;

import java.util.List;
import java.util.UUID;

public interface CollaboratorGateway {
    Collaborator create(CollaboratorDto collaboratorDto);
    List<Collaborator> findAll();
    Collaborator findOne(UUID id);
    Collaborator updateOne(UUID id, CollaboratorDto collaboratorDto);
    void deleteOne(UUID id);
}
