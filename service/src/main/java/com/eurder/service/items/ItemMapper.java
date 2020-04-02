package com.eurder.service.items;

import item.Item;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.stream.Collectors;

import static item.Item.ItemBuilder.itemBuilder;

@Component
public class ItemMapper {



        public Collection<ItemDto> toDto(Collection<Item> itemCollection) {
            return itemCollection.stream().map(this::toDto).collect(Collectors.toList());
        }

        public ItemDto toDto(Item item) {
            return new ItemDto(item.getName()
                    , item.getDescription(), item.getNumberInStock(), item.getPrice());
        }

        public Item toItem(ItemDto itemDto) {
            return itemBuilder().withName(itemDto.getName()).withDescription(itemDto.getDescription())
                    .withNumberInStock(itemDto.getNumberInStock()).build();
        }

}
