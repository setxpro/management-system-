package br.com.setxpro.auth_user.domain.core.gateways;


import br.com.setxpro.auth_user.domain.core.entities.Address;

import java.util.UUID;

public interface AddressGateway {
    Address findOneAccess(UUID id);
    Address updateOneAccess(UUID id, Address access);
}
