package com.nazir.crm.service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nazir.crm.AuthenticationFacade;
import com.nazir.crm.entity.Address;
import com.nazir.crm.entity.Client;
import com.nazir.crm.entity.ContactPerson;
import com.nazir.crm.entity.User;
import com.nazir.crm.repository.AddressRepository;
import com.nazir.crm.repository.ClientRepository;
import com.nazir.crm.repository.ContactPersonRepository;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private AuthenticationFacade authenticationFacade;
	
	private final ClientRepository clientRepository;
	private final ContactPersonRepository contactPersonRepository;
	private final AddressRepository addressRepository;

	public ClientServiceImpl(ClientRepository clientRepository,
			ContactPersonRepository contactPersonRepository,AddressRepository addressRepository) {
		this.clientRepository = clientRepository;
		this.contactPersonRepository = contactPersonRepository;
		this.addressRepository = addressRepository;
	}

	
	@Override
	public Client findById(Long id) {
		return clientRepository.findOne(id);
	}
	
	@Override
	public Client findByName(String name) {
		return clientRepository.findByNameIgnoreCase(name);
	}
	
	@Override
	public List<Client> findAll() {
		return clientRepository.findAll();
	}
	
	@Override
	public List<String> getStatusList() {
		List<String> statusList = Arrays.asList("lead","client","lost");
		return statusList;
	}

	@Override
	public Long saveClientWithLoggedUser(Client client) {
		User user = authenticationFacade.getAuthenticatedUser();
		client.setUser(user);
		client.setCreated(LocalDateTime.now());
		clientRepository.save(client);
		return client.getId();
	}
	@Override
	public Long saveClient(Client client) {
		client.setCreated(LocalDateTime.now());
		clientRepository.save(client);
		return client.getId();
	}



	@Override
	public void deleteClient(Long id) {
		clientRepository.delete(id);
	}


	@Override
	public List<Client> findByUser(User user) {
		return clientRepository.findByUser(user);
	}


}
