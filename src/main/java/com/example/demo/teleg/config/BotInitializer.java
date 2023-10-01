package com.example.demo.teleg.config;

import com.example.demo.teleg.bot.TelegramBot;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;


@Component
public class BotInitializer {


    TelegramBot bot;

    @Autowired
    public BotInitializer(TelegramBot bot){
        this.bot = bot;
    }


    @EventListener({ContextRefreshedEvent.class})
    public void init() throws TelegramApiException {
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        try {
            System.out.println("init");
            telegramBotsApi.registerBot(bot);
            System.out.println("Bot started successfully");
        }
        catch (TelegramApiException e) {
        }

    }
}
