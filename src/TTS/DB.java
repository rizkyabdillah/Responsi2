package TTS;

public class DB {
    
    public DB() {
        
    }
    
    private final String[] pertanyaan = {
        // LEVEL 1
        "SALAH SATU PERALATAN MAKAN",
        "SETELAH JUMAT",
        "PERUSAHAAN BUMN YANG MENGELOLA PENAMBANGAN MINYAK DAN GAS",
        "BAGAI … LUPA AKAN KULITNYA (PERIBAHASA)",
        "HITAM (BAHASA INGGRIS)",
        // LEVEL 2
        "MAHLUK HALUS",
        "PAKAIAN RENANG PEREMPUAN",
        "TIDAK MODERN",
        "BUKU CERITA BERGAMBAR",
        "AYAH (BAHASA G4UL)",
        // LEVEL 3
        "MAINAN UNTUK ANAK PEREMPUAN",
        "BAWA PERASAAN (BAHASA G4UL)",
        "PEMILIHAN KEPALA DAERAH",
        "SEMBILAN BAHAN POKOK",
        "NAMA BULAN"
    };
    
    private final String[] jawaban = {
        // LEVEL 1
        "SENDOK",
        "SABTU",
        "PERTAMINA",
        "KACANG",
        "BLACK",
        // LEVEL 2
        "HANTU",
        "BIKINI",
        "KUNO",
        "KOMIK",
        "BOKAP",
        // LEVEL 3
        "BONEKA",
        "BAPER",
        "PILKADA",
        "SEMBAKO",
        "APRIL"
    };
    
    public String getPertanyaan(int i) {
        return pertanyaan[i];
    }
    
    public String getJawaban(int i) {
        return jawaban[i];
    }
    
}
