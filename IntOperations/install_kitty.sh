#!/usr/bin/env bash

# Exit immediately if a command exits with a non-zero status
set -e

echo "Starting Kitty setup..."

# 1. Download and install Kitty
curl -L https://kovidgoyal.net | sh /dev/stdin \
    launch=n

# 2. Create symbolic links for desktop integration (Linux only)
if [ "$(uname)" = "Linux" ]; then
    echo "Creating desktop shortcuts..."
    mkdir -p ~/.local/bin
    mkdir -p ~/.local/share/applications
    
    # Create symlink to PATH
    ln -sf ~/.local/kitty.app/bin/kitty ~/.local/bin/
    
    # Copy desktop and icon files
    cp ~/.local/kitty.app/share/applications/kitty.desktop ~/.local/share/applications/
    cp ~/.local/kitty.app/share/applications/kitty-open.desktop ~/.local/share/applications/
    sed -i "s|Icon=kitty|Icon=$(readlink -f ~/.local/kitty.app/share/icons/hicolor/256x256/apps/kitty.png)|g" ~/.local/share/applications/kitty*.desktop
    sed -i "s|Exec=kitty|Exec=$(readlink -f ~/.local/bin/kitty)|g" ~/.local/share/applications/kitty*.desktop
fi

# 3. Create the Kitty configuration directory
CONFIG_DIR="$HOME/.config/kitty"
mkdir -p "$CONFIG_DIR"

# 4. Generate a clean configuration file
echo "Writing configuration to $CONFIG_DIR/kitty.conf..."
cat << 'EOF' > "$CONFIG_DIR/kitty.conf"
# --- Fonts ---
font_family      Fira Code
bold_font        auto
italic_font      auto
bold_italic_font auto
font_size        11.0

# --- Window Layout ---
remember_window_size  no
initial_width         960
initial_height        600
window_padding_width  8
hide_window_decorations yes

# --- Performance ---
repaint_delay    10
input_delay      3
sync_to_monitor  yes

# --- Color Scheme (Dark theme template) ---
background            #1e1e2e
foreground            #cdd6f4
selection_background  #f5e0dc
selection_foreground  #1e1e2e
url_color             #f5e0dc

# --- Terminal Bell ---
enable_audio_bell no

# --- Keybindings ---
map ctrl+shift+c copy_to_clipboard
map ctrl+shift+v paste_from_clipboard
map ctrl+shift+enter new_window
map ctrl+shift+] next_window
map ctrl+shift+[ previous_window
EOF

echo "Kitty installation and configuration complete!"
echo "Please restart your terminal session or add ~/.local/bin to your PATH if needed."
