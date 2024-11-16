package edu.example.chat.controller;

import edu.example.chat.oauth.KakaoAPI;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class KakaoController {

    private final KakaoAPI kakaoAPI;

    @GetMapping("/login")
    public String loginForm(Model model) {
        model.addAttribute("kakaoApikey", kakaoAPI.getKakaoApiKey());
        model.addAttribute("redirectUri", kakaoAPI.getKakaoRedirectUri());
        return "login";
    }
}
