create proc sp_LuongNguoiHoc
As Begin
	SELECT 
		YEAR(NgayDK) Nam,
		COUNT(*) SoLuong,
		MIN(NgayDK) DauTien,
		MAX(NgayDK) CuoiCung
	FROM NGUOIHOC
	GROUP BY YEAR(NgayDK)
End
GO

create proc sp_BangDiem(@MaKH Int)
As Begin
	SELECT 
		nh.MaNH,
		nh.HoTen,
		hv.Diem
	FROM HOCVIEN hv
		JOIN NGUOIHOC nh ON nh.MaNH=hv.MaNH
	WHERE hv.MaNH=@MaKH
	ORDER BY hv.Diem DESC
End
GO

create proc sp_DiemChuyenDe
As Begin
	SELECT 
		TenCD ChuyenDe,
		COUNT(MaHV) SoHV,
		MIN(Diem) ThapNhat,
		MAX(Diem) CaoNhat,
		AVG(Diem) TrungBinh
	FROM KHOAHOC kh 
		JOIN HOCVIEN hv ON kh.MaKH=hv.MaKH
		JOIN CHUYENDE cd ON cd.MaCD=kh.MaCD
	GROUP BY TenCD
End
GO

create proc sp_DoanhThu(@Year INT)
As Begin
	SELECT 
		TenCD ChuyenDe,
		COUNT(DISTINCT kh.MaKH) SoKH,
		COUNT(hv.MaHV) SoHV,
		SUM(kh.HocPhi) DoanhThu,
		MIN(kh.HocPhi) ThapNhat,
		MAX(kh.HocPhi) CaoNhat,
		AVG(kh.HocPhi) TrungBinh
	FROM KHOAHOC kh 
		JOIN HOCVIEN hv ON kh.MaKH=hv.MaKH
		JOIN CHUYENDE cd ON cd.MaCD=kh.MaCD
	WHERE YEAR(NgayKG) = @Year
	GROUP BY TenCD
End
GO

