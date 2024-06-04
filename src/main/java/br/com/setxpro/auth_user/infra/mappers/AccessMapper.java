package br.com.setxpro.auth_user.infra.mappers;

import br.com.setxpro.auth_user.domain.core.entities.Access;
import br.com.setxpro.auth_user.infra.database.models.AccessEntity;
import org.springframework.stereotype.Component;

@Component
public class AccessMapper {

    public AccessEntity toAccessEntity(Access access) {
        if (access == null) {
            return null;
        }

        return new AccessEntity(
                access.getId(),
                access.getUsername(),
                access.getPassword(),
                access.getRole()
        );
    }

    public Access toAccessDomainEntity(AccessEntity accessEntity) {

        if (accessEntity == null) {
            return null;
        }

        return new Access(
                accessEntity.getId(),
                accessEntity.getUsername(),
                accessEntity.getPassword(),
                accessEntity.getRole()
        );
    }
}
