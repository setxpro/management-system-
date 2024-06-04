package br.com.setxpro.auth_user.infra.mappers;

import br.com.setxpro.auth_user.domain.core.entities.Collaborator;
import br.com.setxpro.auth_user.infra.database.models.CollaboratorEntity;
import org.springframework.stereotype.Component;

@Component
public class CollaboratorMapper {

    private final AccessMapper accessMapper;
    private final AddressMapper addressMapper;

    public CollaboratorMapper(AccessMapper accessMapper, AddressMapper addressMapper) {
        this.accessMapper = accessMapper;
        this.addressMapper = addressMapper;
    }

    public CollaboratorEntity toCollaboratorEntity(Collaborator collaborator) {

        if (collaborator == null) {
            return null;
        }

        return new CollaboratorEntity(
                collaborator.getId(),
                collaborator.getName(),
                collaborator.getSocialName(),
                collaborator.getLastName(),
                collaborator.getBirthDay(),
                collaborator.getGender(),
                accessMapper.toAccessEntity(collaborator.getAccess()),
                collaborator.getRole(),
                collaborator.getCpfCnpj(),
                collaborator.getRegister(),
                collaborator.getEmail(),
                collaborator.getPhone(),
                collaborator.getPhone2(),
                addressMapper.toAddressEntity(collaborator.getAddress()),
                collaborator.getActive()
        );
    }

    public Collaborator toCollaboratorDomainEntity(CollaboratorEntity collaboratorEntity) {
        if (collaboratorEntity == null) {
            return null;
        }

        return new Collaborator(
                collaboratorEntity.getId(),
                collaboratorEntity.getName(),
                collaboratorEntity.getSocialName(),
                collaboratorEntity.getLastName(),
                collaboratorEntity.getBirthDay(),
                collaboratorEntity.getGender(),
                accessMapper.toAccessDomainEntity(collaboratorEntity.getAccess()),
                collaboratorEntity.getRole(),
                collaboratorEntity.getCpfCnpj(),
                collaboratorEntity.getRegister(),
                collaboratorEntity.getEmail(),
                collaboratorEntity.getPhone(),
                collaboratorEntity.getPhone2(),
                addressMapper.toAddressDomainEntity(collaboratorEntity.getAddress()),
                collaboratorEntity.getActive()
        );
    }
}
