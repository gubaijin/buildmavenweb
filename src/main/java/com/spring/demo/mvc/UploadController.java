package com.spring.demo.mvc;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/upload")
public class UploadController {

	@RequestMapping("/show")
	public String show() {

		return "/demo/upload";
	}

	@RequestMapping("/doUpload")
	public String doUpload(@RequestParam("file") MultipartFile file, Model model) {
		// 保存图片
		String fileName = file.getOriginalFilename();
		try {
			FileUtils.copyInputStreamToFile(file.getInputStream(), new File(
					"C:\\Users\\Public\\Desktop\\" + fileName));
		} catch (IOException e) {
			throw new RuntimeException("上传失败");
		}
		return "/demo/age";
	}
}
