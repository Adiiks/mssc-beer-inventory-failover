package com.adrian.mssc.beer.inventory.failover.controllers;

import com.adrian.brewery.model.BeerInventoryDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(InventoryController.INVENTORY_PATH)
public class InventoryController {

    public static final String INVENTORY_PATH = "/inventory-failover";

    @GetMapping
    public ResponseEntity<List<BeerInventoryDto>> getBeerInventory() {
        BeerInventoryDto beerInventoryDto = BeerInventoryDto.builder()
                .id(UUID.randomUUID())
                .beerId(new UUID(0,0))
                .quantityOnHand(999)
                .createdDate(OffsetDateTime.now())
                .lastModifiedDate(OffsetDateTime.now())
                .build();

        return ResponseEntity.ok(Arrays.asList(beerInventoryDto));
    }
}
