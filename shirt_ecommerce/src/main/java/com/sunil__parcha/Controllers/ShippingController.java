package com.sunil__parcha.Controllers;

import java.util.Optional;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sunil__parcha.Modals.Shopping_cart;
import com.sunil__parcha.Service.ShippingService;

@RestController
public class ShippingController {

	@Autowired
	private ShippingService shippingService;

	@GetMapping(value = "/shoppingcart/generateUniqueId")
	public JSONObject uniqueId() {
		return shippingService.generateUniqueId();
	}

	@PostMapping(value = "/shoppingcart/add")
	public String AddShopingCard(@RequestBody Shopping_cart shoping) {
		shippingService.AddShopingCard(shoping);
		return "You have add your Shipping cart";
	}

	@GetMapping(value = "/shoppingcart/{id}")
	public Optional<Shopping_cart> FindByCartId(@PathVariable("id") int id) {
		return shippingService.findById(id);
	}

	@PutMapping(value = "/shoppingcart/update/{id}")
	public Shopping_cart UpdateShopingCard(@RequestBody Shopping_cart shopping_cart, @PathVariable("id") int id) {
		return shippingService.UpdateShippingById(shopping_cart, id);
	}

	@DeleteMapping(value = "/shoppingcart/empty/{id}")
	public String DeteleShopingCard(@PathVariable("id") int id) {
		return shippingService.DeteleShippingById(id);
	}

	@GetMapping(value = "/shoppingcart/moveToCart/{id}")
	public Optional<Shopping_cart> MoveToCart(@PathVariable("id") int id) {
		return shippingService.MoveToCart(id);
	}

	@GetMapping(value = "/shoppingcart/totalAmount/{id}")
	public JSONObject TotalAmount(@PathVariable("id") int id) {
		return shippingService.TotalAmount(id);
	}
	@GetMapping(value = "/shoppingcart/saveForLater/{id}")
	public Optional<Shopping_cart> SaveForLater(@PathVariable("id") int id) {
		return shippingService.SaveForLater(id);
	}
}
