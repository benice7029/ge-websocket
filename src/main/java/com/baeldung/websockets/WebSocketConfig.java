package com.baeldung.websockets;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void configureMessageBroker(final MessageBrokerRegistry config) {
        config.enableSimpleBroker("/topic");
        config.setApplicationDestinationPrefixes("/app");
    }

    @Override
    public void registerStompEndpoints(final StompEndpointRegistry registry) {
    	registry.addEndpoint(new String[] { "/chat/1" });
    	/* 22 */     registry.addEndpoint(new String[] { "/chat/1" }).setAllowedOrigins(new String[] { "http://localhost:4200", "http://localhost:80", "http://localhost:8081", "https://ge.helpermgmt.com", "https://ge-erp.myadam.xyz" }).withSockJS();
    	/* 23 */     registry.addEndpoint(new String[] { "/chat/2" });
    	/* 24 */     registry.addEndpoint(new String[] { "/chat/2" }).setAllowedOrigins(new String[] { "http://localhost:4200", "http://localhost:80", "http://localhost:8081", "https://ge.helpermgmt.com", "https://ge-erp.myadam.xyz" }).withSockJS();
    	/* 25 */     registry.addEndpoint(new String[] { "/chatwithbots" });
    	/* 26 */     registry.addEndpoint(new String[] { "/chatwithbots" }).setAllowedOrigins(new String[] { "http://localhost:4200", "http://localhost:80", "http://localhost:8081", "https://ge.helpermgmt.com", "https://ge-erp.myadam.xyz" }).withSockJS();
    }

}