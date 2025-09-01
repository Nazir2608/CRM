package com.nazir.crm.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.nazir.crm.entity.Address;
import com.nazir.crm.repository.AddressRepository;

@Service
public class AddressService {

	private final AddressRepository addressRepository;

	public AddressService(AddressRepository addressRepository) {
		this.addressRepository = addressRepository;
	}

	/**Returns list of cities from clients and company offices addresses.
	 * 
	 * @return String list of cities
	 */
	public List<String> getCitiesList() {
		List<Address> addresses = addressRepository.findAll();
		Set<String> cities = new HashSet<String>();
		for (Address address : addresses) {
			cities.add(address.getCity());
		}
		List<String> cityList = new ArrayList<>(cities);

		return cityList;
	}

}
