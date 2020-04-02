package com.eurder.service.items;

import item.Item;
import item.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ItemService {

        private ItemRepository itemRepository;
        private ItemMapper itemMapper;

        @Autowired
        public ItemService(ItemRepository itemRepository, ItemMapper itemMapper) {
            this.itemRepository = itemRepository;
            this.itemMapper = itemMapper;
        }


        public ItemDto addItem(ItemDto itemDto){
            return itemMapper.toDto(itemRepository.addItem(itemMapper.toItem(itemDto)));
        }


    }
