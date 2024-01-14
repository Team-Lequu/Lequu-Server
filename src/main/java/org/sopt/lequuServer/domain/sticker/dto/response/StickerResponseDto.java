package org.sopt.lequuServer.domain.sticker.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import org.sopt.lequuServer.domain.sticker.model.Sticker;

public record StickerResponseDto(

        @Schema(description = "스티커 고유 id", example = "1")
        Long stickerId,

        @Schema(description = "스티커 이미지", example = "https://lequu-server-bucket.s3.ap-northeast-2.amazonaws.com/stickers/birth_1.svg")
        String stickerImage
) {
    public static StickerResponseDto of(Sticker sticker) {
        return new StickerResponseDto(
                sticker.getId(),
                sticker.getStickerImage()
        );
    }
}