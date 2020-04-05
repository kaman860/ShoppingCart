package com.shopcart.product.clients;

import java.util.Arrays;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.shopcart.product.models.ProductQuantityDTO;

@Slf4j
@Component
public class WareHouseServiceAdapter {
	@Value("${wareHouseService.port}")
	private String portNumber;

	@Autowired
	RestTemplate restTemplate;

	public ProductQuantityDTO updateProductQuantity(long id, long quantity) {
		String baseURL = "http://localhost:" + portNumber + "/products/quantity";
		ProductQuantityDTO productQuantity = new ProductQuantityDTO();
		String newURL = baseURL + "/" + id;
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		productQuantity.setProductId(id);
		productQuantity.setQuantity(quantity);

		HttpEntity<ProductQuantityDTO> entity = new HttpEntity<ProductQuantityDTO>(productQuantity, headers);
		log.info("Calling WareHouse Service to update Product Quantity");
		return restTemplate.exchange(newURL, HttpMethod.PUT, entity, ProductQuantityDTO.class).getBody();
	}
}
